package blue.sparse.minecraft.common.world

import blue.sparse.minecraft.common.block.BlockType
import blue.sparse.minecraft.common.util.Proxy
import blue.sparse.minecraft.common.util.ProxyProvider

class Chunk {
	private val data = IntArray(SIZE * SIZE * SIZE)

	//block type		12 bits 0xFFF
	//block state		 4 bits 0xF
	//block light 		 4 bits 0xF
	//sun light			 4 bits 0xF
	//biome				 8 bits 0xFF
	//-------------------------
	//					32 bits

	val proxy by ProxyProvider.invoke<ChunkProxy>(
			"blue.sparse.minecraft.client.world.proxy.ClientChunkProxy",
			"blue.sparse.minecraft.server.world.proxy.ServerChunkProxy",
			this
	)

	internal fun getBlockID(index: Int): Int {
		return data[index] and 0xFFF
	}

	internal fun getBlockID(x: Int, y: Int, z: Int): Int {
		return getBlockID(indexOfBlock(x, y, z))
	}

	fun getBlockType(index: Int): BlockType? {
		return BlockType[getBlockID(index)]
	}

	fun getBlockType(x: Int, y: Int, z: Int): BlockType? {
		return BlockType[getBlockID(x, y, z)]
	}

	fun setBlockType(x: Int, y: Int, z: Int, type: BlockType?) {
		var data = getRaw(x, y, z)
		data = (data.inv() or 0xFFF).inv() or (type?.id ?: 0)
		setRaw(x, y, z, data)
//		data = (data or 0xFFF).inv() or (type?.id ?: 0)
	}

	fun isEmpty(x: Int, y: Int, z: Int): Boolean {
		return getBlockID(x, y, z) != 0
	}

	internal fun getRaw(index: Int): Int {
		return data[index]
	}

	internal fun getRaw(x: Int, y: Int, z: Int): Int {
		return data[indexOfBlock(x, y, z)]
	}

	internal fun setRaw(index: Int, value: Int) {
		data[index] = value
	}

	internal fun setRaw(x: Int, y: Int, z: Int, value: Int) {
		data[indexOfBlock(x, y, z)] = value
	}

	operator fun get(index: Int): BlockView {
		return get(xFromIndex(index), yFromIndex(index), zFromIndex(index))
	}

	operator fun get(x: Int, y: Int, z: Int): BlockView {
		return BlockView(this, x, y, z)
	}

	abstract class ChunkProxy(val chunk: Chunk): Proxy

	companion object {
		const val BITS = 5
		const val SIZE = 1 shl BITS
		const val MASK = SIZE - 1
		const val VOLUME = SIZE * SIZE * SIZE

		fun indexOfBlock(x: Int, y: Int, z: Int): Int {
			if (x < 0 || x >= SIZE || y < 0 || y >= SIZE || z < 0 || z >= SIZE) return -1
			return x + (y * SIZE) + (z * SIZE * SIZE)
		}

		fun xFromIndex(index: Int) = index % SIZE
		fun yFromIndex(index: Int) = (index / SIZE) % SIZE
		fun zFromIndex(index: Int) = ((index / SIZE) / SIZE) % SIZE
	}
}
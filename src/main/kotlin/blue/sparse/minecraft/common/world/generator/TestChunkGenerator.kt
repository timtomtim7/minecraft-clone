package blue.sparse.minecraft.common.world.generator

import blue.sparse.math.vectors.ints.Vector3i
import blue.sparse.minecraft.common.biome.BiomeType
import blue.sparse.minecraft.common.block.Block
import blue.sparse.minecraft.common.block.BlockType
import blue.sparse.minecraft.common.util.math.Perlin
import blue.sparse.minecraft.common.util.math.Voronoi
import blue.sparse.minecraft.common.world.Chunk

object TestChunkGenerator: ChunkGenerator {
	override fun generate(chunkPosition: Vector3i, blocks: Array<Block>) {
		val cbx = chunkPosition.x shl Chunk.BITS
		val cby = chunkPosition.y shl Chunk.BITS
		val cbz = chunkPosition.z shl Chunk.BITS

		for(x in 0 until Chunk.SIZE) {
			for(z in 0 until Chunk.SIZE) {
				val (temperature, humidity) = generateBiome(x + cbx, z + cbz)
				val biome = BiomeType[temperature, humidity] ?: BiomeType.void

				var maxY = (Perlin.noise((cbx + x).toFloat(), (cbz + z).toFloat(), 0f, 8, 0.5f, 0.002f) * 64)
				maxY *= (Perlin.noise((cbx + x).toFloat(), (cbz + z).toFloat(), 100f, 1, 1f, 0.02371f) + 1) * 2
				maxY += 64
				val maxYInt = maxY.toInt()

//				val maxY = biome.id * 2

				for(y in 0 until Chunk.SIZE) {

					val ry = y + cby
					val blockType = when {
						ry > maxYInt -> null
						ry == maxYInt -> BlockType.grass
						ry >= maxYInt - 4 -> BlockType.dirt
						else -> BlockType.stone
					}

					blocks[Chunk.indexOfBlock(x, y, z)] = Block(blockType, biome = biome)
				}
			}
		}
	}

	fun generateBiome(x: Int, y: Int): BiomeInfo {
		var nx = x * 0.2f
		var ny = y * 0.2f
		nx += Perlin.noise(nx + 2874, ny, 0f, 1, 1f, 0.2f)
		ny += Perlin.noise(nx, ny - 9142, 0f, 1, 1f, 0.2f)

		val noise = Voronoi[nx, ny]

		var temperature = Perlin.noise(noise.x + 5312, noise.y + 1944, 0f, 1, 1f, 0.05f) * 0.5f + 0.5f
		val humidity = Perlin.noise(noise.x - 9141, noise.y - 2374, 0f, 1, 1f, 0.1f) * 0.5f + 0.5f

		temperature = temperature * 3 - 1

		return BiomeInfo(temperature, humidity)
	}

	data class BiomeInfo(val temperature: Float, val humidity: Float)
}
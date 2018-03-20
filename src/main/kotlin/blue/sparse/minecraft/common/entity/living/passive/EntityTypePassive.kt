package blue.sparse.minecraft.common.entity.living.passive

import blue.sparse.minecraft.common.entity.living.EntityTypeLiving
import blue.sparse.minecraft.common.util.Identifier

abstract class EntityTypePassive(id: Identifier) : EntityTypeLiving(id) {
    constructor(id: String) : this(Identifier(id))
}
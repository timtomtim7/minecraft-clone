package blue.sparse.minecraft.common.entity.living.hostile.undead

import blue.sparse.minecraft.common.entity.living.hostile.EntityTypeHostile
import blue.sparse.minecraft.common.util.Identifier

abstract class EntityTypeUndead(id: Identifier) : EntityTypeHostile(id) {
    constructor(id: String) : this(Identifier(id))
}
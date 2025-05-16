package org.example.creational.prototype

abstract class GameUnit: Cloneable {
    private var position = Position3D.ZERO

    fun move(position: Position3D) {
        this.position = position
    }

    fun getPosition() = position

    private fun initialize() {
        position = Position3D.ZERO
        reset()
    }

    protected abstract fun reset()

    public override fun clone(): GameUnit {
        val unit = super.clone() as GameUnit
        unit.initialize()
        return unit
    }
}

class Swordsman : GameUnit() {
    private var state = "idle"

    fun attack() {
        state = "attack"
    }

    override fun toString(): String {
        return "Swordsman $state @ ${getPosition()}"
    }

    override fun reset() {
        state = "idle"
    }
}

class General: GameUnit() {
    private var state = "idle"

    fun boostMorale() {
        state = "MoralBoost"
    }

    override fun toString(): String {
        return "GameUnit $state @ ${getPosition()}"
    }

    override fun clone(): GameUnit {
        throw CloneNotSupportedException("General is unique")
    }

    override fun reset() {
        throw UnsupportedOperationException("Reset not supported")
    }
}

data class Position3D(
    val x: Float, val y: Float, val z: Float
) {
    companion object {
        val ZERO = Position3D(0f, 0f, 0f)
    }
}

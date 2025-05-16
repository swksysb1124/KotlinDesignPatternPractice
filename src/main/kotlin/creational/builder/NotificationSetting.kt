package org.example.creational.builder

data class NotificationSetting(val enabled: Boolean, val subscriptions: List<Subscription>)

data class Subscription(val description: Description, val topic: Topic, val frequency: Frequency) {
    enum class Topic { NEWS, ANALYTICS, SECURITY_ALERTS }
    enum class Frequency { IMMEDIATELY, DAILY, WEEKLY }
}

sealed interface Description

@JvmInline
value class EmailAddress(val value: String) : Description

@JvmInline
value class PhoneNumber(val value: String) : Description


class NotificationSettingBuilder: INotificationSettingBuilder {
    override var enabled: Boolean = false
    private val subscriptions = mutableListOf<Subscription>()

    override fun addSubscription(description: Description, topic: Subscription.Topic, freq: Subscription.Frequency) {
        subscriptions.add(Subscription(description, topic, freq))
    }

    override fun build(): NotificationSetting = NotificationSetting(enabled, subscriptions.toList())
}

interface INotificationSettingBuilder {
    var enabled: Boolean
    fun addSubscription(description: Description, topic: Subscription.Topic, freq: Subscription.Frequency)
    fun build(): NotificationSetting
}

fun buildNotificationSetting(block: NotificationSettingBuilder.() -> Unit) =
    NotificationSettingBuilder().apply(block).build()

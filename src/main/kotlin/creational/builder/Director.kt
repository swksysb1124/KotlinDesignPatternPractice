package org.example.creational.builder

fun main() {
    createNotificationSetting(
        "example@example.com",
        "1-555-555-5555"
    )
}

fun createNotificationSetting(email: String?, phoneNumber: String?): NotificationSetting {
    val builder = NotificationSettingBuilder()
    builder.enabled = true
    if (email != null) builder.addSubscription(
        EmailAddress(email),
        Subscription.Topic.ANALYTICS,
        Subscription.Frequency.DAILY
    )
    if (email != null) builder.addSubscription(
        EmailAddress(email),
        Subscription.Topic.NEWS,
        Subscription.Frequency.WEEKLY
    )
    if (phoneNumber != null) builder.addSubscription(
        PhoneNumber(phoneNumber),
        Subscription.Topic.SECURITY_ALERTS,
        Subscription.Frequency.IMMEDIATELY
    )
    return builder.build()
}
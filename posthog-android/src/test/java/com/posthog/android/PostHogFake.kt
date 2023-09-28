package com.posthog.android

import com.posthog.PostHogConfig
import com.posthog.PostHogInterface
import com.posthog.PostHogOnFeatureFlags

public class PostHogFake : PostHogInterface {
    public var event: String? = null
    public var screenTitle: String? = null
    public var properties: Map<String, Any>? = null
    public var captures: Int = 0

    override fun <T : PostHogConfig> setup(config: T) {
    }

    override fun close() {
    }

    override fun capture(
        event: String,
        distinctId: String?,
        properties: Map<String, Any>?,
        userProperties: Map<String, Any>?,
        userPropertiesSetOnce: Map<String, Any>?,
        groupProperties: Map<String, Any>?,
    ) {
        this.event = event
        this.properties = properties
        captures++
    }

    override fun identify(
        distinctId: String,
        properties: Map<String, Any>?,
        userProperties: Map<String, Any>?,
        userPropertiesSetOnce: Map<String, Any>?,
    ) {
    }

    override fun reloadFeatureFlagsRequest(onFeatureFlags: PostHogOnFeatureFlags?) {
    }

    override fun isFeatureEnabled(key: String, defaultValue: Boolean): Boolean {
        return false
    }

    override fun getFeatureFlag(key: String, defaultValue: Any?): Any? {
        return null
    }

    override fun getFeatureFlagPayload(key: String, defaultValue: Any?): Any? {
        return null
    }

    override fun flush() {
    }

    override fun reset() {
    }

    override fun optIn() {
    }

    override fun optOut() {
    }

    override fun group(type: String, key: String, groupProperties: Map<String, Any>?) {
    }

    override fun screen(screenTitle: String, properties: Map<String, Any>?) {
        this.screenTitle = screenTitle
    }

    override fun alias(alias: String, properties: Map<String, Any>?) {
    }

    override fun isOptOut(): Boolean {
        return false
    }

    override fun register(key: String, value: Any) {
    }

    override fun unregister(key: String) {
    }
}

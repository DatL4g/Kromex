package model

import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.jsonObject
import utils.Constants


abstract class PropertiesHolder{
    internal open val _properties: JsonElement? = null

    val properties: Map<String, ExtensionProperty>
        get() {
            val propertyValues: MutableMap<String, ExtensionProperty> = mutableMapOf()
            _properties?.jsonObject?.forEach { t, u ->
                try {
                    propertyValues[t] = Constants.json.decodeFromJsonElement(u)
                } catch (ignored: Throwable) { }
            }
            return propertyValues
    }
}

package org.mcp4j.client

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.websocket.*
import io.ktor.websocket.*
import kotlinx.coroutines.*

class McpClient(private val serverUrl: String) {
    private val client = HttpClient(CIO) {
        install(WebSockets)
    }

    fun connectAndRun() = runBlocking {
        client.webSocket(urlString = serverUrl) {
            println("Connected to $serverUrl")

            // Example send
            send("Hello from MCP client!")

            // Example receive loop
            for (message in incoming) {
                when (message) {
                    is Frame.Text -> println("Received: ${message.readText()}")
                    else -> println("Received non-text frame.")
                }
            }
        }
    }

    fun close() {
        client.close()
    }
}

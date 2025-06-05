package org.mcp4j.examples

import org.mcp4j.client.McpClient

fun main() {
    val client = McpClient("wss://my.mcp.server")
    client.connectAndRun()
}

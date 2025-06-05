# MCP4J

A lightweight Kotlin/Java SDK for Model Context Protocol designed for JVM-based AI applications.

## Features
- JSON-RPC 2.0 over WebSocket
- Context and message management
- Tool invocation and results
- Kotlin DSL
- Extensible and framework-agnostic

## Modules
```
mcp4j/
├── mcp-core/ # Protocol objects, JSON-RPC, DTOs, validation
├── mcp-client/ # WebSocket client, reconnect, lifecycle
├── mcp-dsl/ # Kotlin DSL for user-friendly API
├── mcp-spring/ # Spring Boot autoconfiguration
├── examples/ # Simple usage examples
└── build.gradle.kts # Root build config
```

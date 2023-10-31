# RISC V Assembler

## Building

1. Check out this code 
1. Into the same folder, checkout https://github.com/rrevenantt/antlr4rust
1. Generate the parser code: navigate to the folder that contains the .toml file and then execute cargo run --bin build_parser
1. Build the application: cargo build
1. Run the application: cargo run

## Errors

### Cargo hangs with "Blocking waiting for file lock on package cache"

```
cargo run --bin build_parser
Blocking waiting for file lock on package cache
```

Solution: Close all running Visual Studio Code instances. Execute "cargo run --bin build_parser" on the command line outside 
any Visual Studio Code.

## Testing the grammar

Use http://lab.antlr.org/ and paste your lexer (riscvasm\src\parser\riscvasm_lexer.g4) and parser (riscvasm\src\parser\riscvasm.g4).
Use *program* as the start symbol.
Parse samples from the test_resources folder.
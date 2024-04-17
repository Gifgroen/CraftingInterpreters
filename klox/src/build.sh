#!/usr/bin/env bash
CC=kotlinc

BASE_DIR="${HOME}/Projects/Multiplatform/CraftingInterpreters/develop/klox"

COMMON_COMPILER_FLAGS="-include-runtime"

mkdir -p $BASE_DIR/build
pushd $BASE_DIR/build

# kotlinc src/main.kt -include-runtime -d build/klox.jar
OUTPUT="-d klox.jar"
# Create main interpreter
$CC $BASE_DIR/src/main.kt $COMMON_COMPILER_FLAGS $OUTPUT

popd
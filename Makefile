.PHONY: build_env run_env

build_env:
	@echo "Building Kotlin env image as kotlin_env..."
	docker build -t kotlin_env -f Dockerfile .

run_env:
	@echo "Running Kotlin env kotlin_env as container..."
	@echo "Mounting local:container folders: ./src:/src"
	docker run -v $(shell pwd)/src:/src -it kotlin_env
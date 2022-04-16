FROM ubuntu:20.04

WORKDIR /src

RUN apt update && apt install -y \
    openjdk-11-jdk \
    snapd

RUN snap install --classic kotlin
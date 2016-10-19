# Using the Intercom API with Go

## Disclaimer
- I'm not familiar with Go so these instructions may not even be best practise but it allows testing of library

## General Go Information

- Install via https://golang.org/dl/

## Test intercom-go

### Installation

- Follow latest details as per https://github.com/intercom/intercom-go
- Currently: 
```
GOPATH=`pwd` go get gopkg.in/intercom/intercom-go.v2
```

### Running 
- Modify `src/example/testing-intercom-go/testing-intercom-go.go` to insert your API keys / access tokens 
- Compile: 
```
GOPATH=`pwd` go install example/testing-intercom-go
```
- Run: `bin/testing-intercom-go`
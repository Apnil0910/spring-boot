FROM golang:1.12-alpine AS build
#Install git
RUN apk add --no-cache git
#Get the spring boot example from a GitHub repository
RUN go get github.com/Apnil0910/spring-boot
WORKDIR /go/src/github.com/Apnil0910/spring-boot
# Build the project and send the output to /bin/HelloWorld 
RUN go build -o /bin/spring-boot

FROM golang:1.12-alpine
#Copy the build's output binary from the previous build container
COPY --from=build /bin/spring-boot /bin/spring-boot
ENTRYPOINT ["/bin/spring-boot"]

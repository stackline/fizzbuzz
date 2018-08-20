# How to hello world

```sh
# Install clojure builder
$ brew install leiningen

# Install java
$ curl -s "https://get.sdkman.io" | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
$ sdk install java

# Execute hello world application
$ mkdir clojure
$ cd clojure
$ lein new app fizzbuzz
$ cd fizzbuzz
$ lein run
Hello, World
```

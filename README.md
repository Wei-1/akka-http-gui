# akka-http-gui

[![Build Status](https://travis-ci.org/Wei-1/akka-http-gui.svg?branch=master)](https://travis-ci.org/Wei-1/akka-http-gui)

Akka-Http is widely used in a lot of backend services because its actor system provides a great scalability.

This repository demonstrates a simple way to set up an Akka-Http Web GUI together with HTML and JavaScript.


## Web Host

The `getFromFile` command provides a way for us to host all our contents including our `index.html` and `content.js` files.

Note that the `public` folder is a personal design choice. One can use other names to serve the same purpose.


## Usage

Use `sbt` to run the code and see the Web GUI at `localhost:8080` with your browser.

```bash
sbt run
```

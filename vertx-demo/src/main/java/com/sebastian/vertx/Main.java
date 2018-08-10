package com.sebastian.vertx;

import io.vertx.core.AbstractVerticle;

/**
 * demo de aplicación utilizando vert.x.
 * @author Sebastian Avila A.
 *
 */
public class Main extends AbstractVerticle {

  @Override
  public void start() {
    vertx.createHttpServer().requestHandler(req -> req.response().end("Hola Vert.x!")).listen(8080);
  }
}

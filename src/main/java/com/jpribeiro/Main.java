package com.jpribeiro;

import io.javalin.Javalin;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        Javalin app = Javalin.create().start(8080);

        app.get("/add", ctx -> {
            double a = Double.parseDouble(Objects.requireNonNull(ctx.queryParam("a")));
            double b = Double.parseDouble(Objects.requireNonNull(ctx.queryParam("b")));
            ctx.result(String.valueOf(service.add(a, b)));
        });

        app.get("/subtract", ctx -> {
            double a = Double.parseDouble(Objects.requireNonNull(ctx.queryParam("a")));
            double b = Double.parseDouble(Objects.requireNonNull(ctx.queryParam("b")));
            ctx.result(String.valueOf(service.subtract(a, b)));
        });

        app.get("/multiply", ctx -> {
            double a = Double.parseDouble(Objects.requireNonNull(ctx.queryParam("a")));
            double b = Double.parseDouble(Objects.requireNonNull(ctx.queryParam("b")));
            ctx.result(String.valueOf(service.multiply(a, b)));
        });

        app.get("/divide", ctx -> {
            double a = Double.parseDouble(Objects.requireNonNull(ctx.queryParam("a")));
            double b = Double.parseDouble(Objects.requireNonNull(ctx.queryParam("b")));
            ctx.result(String.valueOf(service.divide(a, b)));
        });
    }
}
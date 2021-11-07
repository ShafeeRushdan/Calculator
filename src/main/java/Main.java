import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/", Location.CLASSPATH);
        }).start(9000);


        app.get("/hello-world", ctx -> ctx.result("Hello World"));

        app.get("/form-add", context -> {
            int val1  = Integer.parseInt(context.queryParam("val1"));
            int val2  = Integer.parseInt(context.queryParam("val2"));

            System.out.println(val1);
            System.out.println(val2);
            context.result(String.valueOf(val1 + val2));
        });

        app.get("/form-sub", context -> {
            int val3  = Integer.parseInt(context.queryParam("val3"));
            int val4  = Integer.parseInt(context.queryParam("val4"));

            System.out.println(val3);
            System.out.println(val4);
            context.result(String.valueOf(val3 - val4));
        });

        app.get("/form-multiply", context -> {
            int val5  = Integer.parseInt(context.queryParam("val5"));
            int val6  = Integer.parseInt(context.queryParam("val6"));

            System.out.println(val5);
            System.out.println(val6);
            context.result(String.valueOf(val5 * val6));
        });

        app.get("/form-divide", context -> {
            int val7  = Integer.parseInt(context.queryParam("val7"));
            int val8  = Integer.parseInt(context.queryParam("val8"));

            System.out.println(val7);
            System.out.println(val8);
            context.result(String.valueOf(val7 / val8));
        });
    }
}

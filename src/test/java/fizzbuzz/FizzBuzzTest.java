package fizzbuzz;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest {

    // instanciando (creando un objeto que representa el juego)
    JuegoFizzBuzz juego = new JuegoFizzBuzz();

    @Test
    public void laPrimeraRespuestaEs1() {

        String respuesta = juego.responder(1);
        assertThat(respuesta, equalTo("1"));
    }

    @Test
    void laRespuestaA2Es2() {
        String respuesta = juego.responder(2);
        assertThat(respuesta, equalTo("2"));
    }

    @Test
    void laRespuestaA3EsFizz() {
        String respuesta = juego.responder(3);
        assertThat(respuesta, equalTo("Fizz"));
    }

    @Test
    void laRespuestaA5EsBuzz() {
        String respuesta = juego.responder(5);
        assertThat(respuesta, equalTo("Buzz"));
    }

    @Test
    void laRespuestaA6EsFizz() {
        String respuesta = juego.responder(6);
        assertThat(respuesta, equalTo("Fizz"));
    }

    @Test
    void laRespuestaA9EsFizz() {
        String respuesta = juego.responder(9);
        assertThat(respuesta, equalTo("Fizz"));
    }

    @Test
    void laRespuestaA10EsBuzz() {
        String respuesta = juego.responder(10);
        assertThat(respuesta, equalTo("Buzz"));
    }

    @Test
    void laRespuestaA12EsFizz() {
        String respuesta = juego.responder(12);
        assertThat(respuesta, equalTo("Fizz"));
    }

    @Test
    void laRespuestaA13Es13() {
        String respuesta = juego.responder(13);
        assertThat(respuesta, equalTo("13"));
    }

    @Test
    void laRespuestaA15EsFizzBuzz() {
        String respuesta = juego.responder(15);
        assertThat(respuesta, equalTo("FizzBuzz"));
    }

    @Test
    void laRespuestaA20EsBuzz() {
        String respuesta = juego.responder(20);
        assertThat(respuesta, equalTo("Buzz"));
    }

    @Test
    void laRespuestaA30EsFizzBuzz() {
        String respuesta = juego.responder(30);
        assertThat(respuesta, equalTo("FizzBuzz"));
    }

    @Test
    void laRespuestaA45EsFizzBuzz() {
        String respuesta = juego.responder(45);
        assertThat(respuesta, equalTo("FizzBuzz"));
    }
}

## 🌶️ Ejercicio 1 – **El Club Casi Secreto™**

> En una ciudad donde la lógica es opcional y las contraseñas son más seguras que una puerta sin cerradura, existe un club llamado “Club Casi Secreto™”. El acceso es otorgado solo si:
> 
1. Tienes más de 18 años.
2. Conoces la ultra secreta clave: `"1234"`.
3. Dices correctamente la frase secreta: `"la matrix vive"`.
4. El sistema debe verificar **3 intentos consecutivos**.
5. Si alguien falla una condición, no se le deja entrar, pero se sigue preguntando a los demás.

Solucion

Primero que todo generamos el scanner y verificamos que arriba corrobore que esta scaneando con la frase "import java.util.Scanner"

El codigo debera imprimir primero que todo una frase preguntando si es mayor de edad, de ahi entrara un condicional de que, si lo afirma, preguntar con otro mensaje la clave ultrasecreta y la frase secreta, todo esto se hace pidiendo que lo ingrese por teclado con scanner, ya que el cuarto punto nos exige que el programa debe verificar 3 veces consecutivas utilizamos el ciclo for.

en todas las condiciones debe estar la condicion de que sino se cumple, se vuelva a repetir el ciclo pero a una nueva persona.
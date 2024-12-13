Algoritmo sin_titulo
	Escribir "Introduce numero 1"
	Leer num1
	Escribir "Introduce numero 2"
	Leer num2
	restar = num1-num2
	sumar = num1+num2
	multiplicar = num1*num2
	division = num1/num2
	Escribir "¿Que operacion quieres hacer? (sumar,restar,multiplicar,dividir)" 
	Leer operacion
	Según operacion Hacer
		"sumar": 
			Escribir "La operqcion es ",sumar
		"restar":
			Escribir "La operacion es ",restar
		"multiplicar":
			Escribir "La operacion es ",multiplicar
	
		"dividir":
			Escribir "La operacion es ",dividir
	FinSegún
	
FinAlgoritmo

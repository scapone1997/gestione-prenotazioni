package org.myproject

import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.annotations.QuarkusMain

@QuarkusMain
class MainApp

fun main(args: Array<String>) {
    println("Avvio del microservizio Gestione Prenotazioni...")
    Quarkus.run(*args)
}
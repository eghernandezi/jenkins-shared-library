
package org.build

class Test {

	def print() {
		print("Hello")
	}

	def call(String name = 'human') {
        // Any valid steps can be called from this code, just like in other
        // Scripted Pipeline
        echo "Hello, ${name}."
    }

//Esta es una modificacion de prueba
}

package org.df.11111d.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class 11111d {

	public static void main(String[] args) throws Exception {
		DBServer.start("11111d-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("11111d"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}

package javapackage;
public @interface Source {

	String url();

	String mail() default ""; // Optional
}

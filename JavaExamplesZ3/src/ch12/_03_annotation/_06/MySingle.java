package ch12._03_annotation._06;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
	int value();
}
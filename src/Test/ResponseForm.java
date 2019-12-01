package Test;

import java.lang.annotation.*;

/**
 * @Author TangXi
 * @Date 19-11-12 上午9:35
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface ResponseForm {
	int type() default 0;
	String level() default "info";
	String value() default "";
}

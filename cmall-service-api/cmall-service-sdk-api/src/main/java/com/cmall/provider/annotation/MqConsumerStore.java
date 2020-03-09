
package com.cmall.provider.annotation;

import java.lang.annotation.*;


/**
 * 保存消费者消息.
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MqConsumerStore {

	boolean storePreStatus() default true;
}

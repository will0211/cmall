
package com.cmall.config.properties;

import lombok.Data;

/**
 * The class Async task properties.
 *
 */
@Data
public class SwaggerProperties {

	private String title;

	private String description;

	private String version = "1.0";

	private String license = "Apache License 2.0";

	private String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";

	private String contactName = "半兽人";

	private String contactUrl = "http://www.chilangedu.com";

	private String contactEmail = "44110695@qq.com";
}

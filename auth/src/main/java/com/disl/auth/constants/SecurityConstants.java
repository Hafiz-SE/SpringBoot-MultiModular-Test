package com.disl.auth.constants;

public class SecurityConstants {
	public static final String SECRET = "2034f6e32958647fdff75d265b455ebf";
	public static final long EXPIRATION_TIME = 86400000; // 10 days
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final long REFRESH_TOKEN_EXPIRATION_TIME =  864000000;

	public static final String[] JWTDisabledAntMatchers = {
			"/signin",
			"/signup",
			"/resetpassword/**",
			"/pass-reset",
			"/forgetpassword",
			"/api-documentation.html",
			"/swagger-ui/**",
			"/api-docs/**",
			"/verify/**",
			"/v2/api-docs",
            "/configuration/ui",
            "/swagger-resources/**",
            "/configuration/security",
            "/swagger-ui.html",
			"/webjars/**",
			"/refreshtoken"
	};


}

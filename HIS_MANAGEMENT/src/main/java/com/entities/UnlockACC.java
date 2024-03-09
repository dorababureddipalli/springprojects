package com.entities;

import lombok.Data;

@Data
public class UnlockACC {
	private String email;
	private String temporaryPassword;
	private String password;
	private String confirmPassword;
}

package com.kanbam.project.model.user;

public record RegisterDTO(String login, String password, UserRole role ) {
}
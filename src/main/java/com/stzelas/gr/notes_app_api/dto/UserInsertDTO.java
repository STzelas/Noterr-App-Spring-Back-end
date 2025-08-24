package com.stzelas.gr.notes_app_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Schema(description = "Create User Request",
        example = """
{
  "username": "user123",
  "password": "Secret123",
  "firstname": "John",
  "lastname": "Doe"
}
""")
public record UserInsertDTO(

        @NotEmpty(message = "Το username δεν μπορεί να είναι κενό")
        @Size(min = 4, max = 15, message = "Το username πρέπει να είναι μεταξύ 4 και 15 χαρακτήρων")
        @Pattern(regexp = "^\\S+$", message = "Δεν επιτρέπονται white spaces.")
        String username,
        @NotEmpty(message = "Το password δεν μπορεί να είναι κενό")
        @Size(min = 6, max = 15, message = "Το password πρέπει να είναι τουλάχιστον 6 χαρακτήρες")
        @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])\\S{6,}$",
                message = "Ο κωδικός πρέπει να περιέχει 1 τουλάχσιτον μικρό και κεφαλαίο γράμμα και 1 αριθμό χωρίς κενά.")
        String password,
        @NotEmpty(message = "Το όνομα δεν μπορεί να είναι κενό")
        @Size(min = 3, max = 15, message = "Το password όνομα να είναι τουλάχιστον 3 χαρακτήρες")
        @Pattern(regexp = "^\\S+$", message = "Δεν επιτρέπονται white spaces.")
        String firstname,
        @NotEmpty(message = "Το επίθετο δεν μπορεί να είναι κενό")
        @Size(min = 3, max = 15, message = "Το επίθετο πρέπει να είναι τουλάχιστον 3 χαρακτήρες")
        @Pattern(regexp = "^\\S+$", message = "Δεν επιτρέπονται white spaces.")
        String lastname
) {}

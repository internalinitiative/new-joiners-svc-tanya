package com.example.githubcopilot_joiners.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException{

        public ResourceNotFoundException(String message){
            super(message);
        }

}

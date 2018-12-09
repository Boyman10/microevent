package net.rhm.microemail.service;

import net.rhm.microemail.dto.UserDto;

public interface EmailService {
    void sendSimpleMessage(UserDto input);
}

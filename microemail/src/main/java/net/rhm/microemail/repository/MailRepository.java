package net.rhm.microemail.repository;

import net.rhm.microemail.entity.Mail;
import org.springframework.data.repository.CrudRepository;

public interface MailRepository extends CrudRepository<Mail, Long> {

}
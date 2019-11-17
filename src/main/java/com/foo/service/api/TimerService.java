package com.foo.service.api;
import com.foo.domain.Timer;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TimerService
 *
 * TODO Auto-generated class documentation
 *
 */
@RooService(entity = Timer.class)
public interface TimerService extends EntityResolver<Timer, Long>, ValidatorService<Timer> {
}

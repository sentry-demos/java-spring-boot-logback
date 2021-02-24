package io.sentry.demos.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import io.sentry.SentryEvent;


@Component
public class CustomBeforeSendCallback implements SentryOptions.BeforeSendCallback {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
  
  
    @Override
    public SentryEvent execute(SentryEvent event, Object hint) {
        // Data Scrubbing Example: Never send server name in events
        // event.setServerName(null);

        logger.info("BEFORE SEND......");
        return event;
    }
}
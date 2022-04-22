package io.spring.task.taskdemometrics;
import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Christian Tzolov
 */
@ConfigurationProperties(prefix = "task.demo")
public class TaskDemoMetricsProperties {

    private int range = 100;
    private Delay delay = new Delay(Duration.ofMinutes(1), Duration.ofSeconds(10));

    public static class Delay {

        private Duration fixed = Duration.ofSeconds(0);
        private Duration random = Duration.ofSeconds(1);

        public Delay(Duration fixed, Duration random) {
            this.fixed = fixed;
            this.random = random;
        }

        public Duration getFixed() {
            return fixed;
        }

        public void setFixed(Duration fixed) {
            this.fixed = fixed;
        }

        public Duration getRandom() {
            return random;
        }

        public void setRandom(Duration random) {
            this.random = random;
        }
    }

    public int getRange() {
        return range;
    }

    public Delay getDelay() {
        return delay;
    }
}

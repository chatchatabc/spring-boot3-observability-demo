Spring Boot 3 Observability demo
===============================

# Observability

* Logging: slf4j, log4j, elastic search
* Metrics: Grafana Metrics Dashboard
* Tracing: ZipKin
* Events: JRF, Kafka Topic

# Logging

* Java Error Messages Wizard: https://github.com/linux-china/java-error-messages-wizard

# Metrics

* Counters
* Gauges
* DistributionSummary(Histograms)
* TimeGauge:
* Timer: track of a large number of short running events - Counters + Histograms

# Tracing

Please refer [Tracing in Spring Boot 3 WebFlux](https://betterprogramming.pub/tracing-in-spring-boot-3-webflux-d432d0c78d3e)

# Events

* JFR Explorer: https://www.chriswhocodes.com/jfr_jdk19.html

# Prometheus and Grafana Setup

Please modify `data/prometheus/prometheus.yml` to update Spring Boot IP Address.

Then execute `docker-compose up -d` to start Prometheus and Grafana.

* Prometheus: http://localhost:9090
* Grafana: http://localhost:3000

# References
               
* Observability with Spring Boot 3: https://www.baeldung.com/spring-boot-3-observability
* Observability with Spring Boot 3: https://spring.io/blog/2022/10/12/observability-with-spring-boot-3
* What Is Observability? https://tanzu.vmware.com/developer/tv/enlightning/10/
* Micrometer: https://micrometer.io/
* Spring Metrics: https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.metrics
* Java Flight Recorder: https://docs.oracle.com/en/java/java-components/jdk-mission-control/8/user-guide/using-jdk-flight-recorder.html
* Monitoring Spring Boot Application with Prometheus and Grafana: https://refactorfirst.com/spring-boot-prometheus-grafana
* Set up and observe a Spring Boot application with Grafana Cloud, Prometheus, and OpenTelemetry: https://grafana.com/blog/2022/04/26/set-up-and-observe-a-spring-boot-application-with-grafana-cloud-prometheus-and-opentelemetry/
* Spring Boot Logback and Log4j2 Extensions: https://www.baeldung.com/spring-boot-logback-log4j2

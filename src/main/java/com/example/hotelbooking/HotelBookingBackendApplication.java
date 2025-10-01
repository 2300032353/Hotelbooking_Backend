@SpringBootApplication
public class HotelBookingBackendApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HotelBookingBackendApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HotelBookingBackendApplication.class);
    }
}


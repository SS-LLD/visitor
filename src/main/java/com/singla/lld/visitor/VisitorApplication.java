package com.singla.lld.visitor;

import com.singla.lld.visitor.opernation.Operations;
import com.singla.lld.visitor.opernation.Price;
import com.singla.lld.visitor.room.Room;
import com.singla.lld.visitor.room.SingleBedRoom;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class VisitorApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(VisitorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Operations operations = new Price();

		Room room = new SingleBedRoom();
		System.out.println(room.accept(operations));

	}
}

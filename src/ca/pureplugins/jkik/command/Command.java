package ca.pureplugins.jkik.command;

import java.util.Arrays;
import java.util.List;

import ca.pureplugins.jkik.interfaces.IChat;
import lombok.Data;

@Data
public abstract class Command
{
	private final List<String> aliases;
	private IChat chat;
	private String[] args;

	public Command(String... aliases)
	{
		this.aliases = Arrays.asList(aliases);
	}

	public abstract void execute();
}
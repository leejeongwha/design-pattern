package com.naver.pattern.facade.system;

public class Computer {
	private static int BOOT_ADDRESS = 100;
	private static long BOOT_SECTOR = 500L;
	private static int SECTOR_SIZE = 128;

	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;

	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}

	public void startComputer() {
		cpu.freeze();
		memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
		cpu.jump(BOOT_ADDRESS);
		cpu.execute();
	}
}

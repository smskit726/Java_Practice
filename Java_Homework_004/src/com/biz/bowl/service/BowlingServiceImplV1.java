package com.biz.bowl.service;

import java.util.List;
import java.util.Scanner;

public class BowlingServiceImplV1 implements BowlingService {

	private List<Integer> scoreList;
	private Scanner scan;

	private BowlingServiceImplV1() {

	}

	public BowlingServiceImplV1(Scanner scan, List<Integer> scoreList) {
		this.scan = scan;
		this.scoreList = scoreList;
	}

	@Override
	public void scoreInput() {

		String strScore = "";
		Integer intScore = 0;
		int frame = 0;

		for (frame = 1; frame <= 10; frame++) {

			while (true) {
				System.out.printf("%s 프레임 초구\n", frame);
				System.out.print("쓰러트린 핀의 갯수를 입력하세요 (가능 - 0 ~ 10): ");
				strScore = scan.nextLine();

				try {
					intScore = Integer.valueOf(strScore);

					if (intScore > 10 || intScore < 0) {
						System.out.println("점수는 0~10 까지 숫자만 입력가능합니다 :(");
						continue;
					} else if (intScore == 10) {
						scoreList.add(intScore);
						frame++;
						return;
					}
				} catch (NumberFormatException e) {
					System.out.println("점수입력이 잘못되었습니다. 다시 입력해주세요 :(");
					continue;
				}

				scoreList.add(intScore);
				break;
			}

			int lmScore = 10 - intScore;
			
			while (true) {
				System.out.printf("%s 프레임 두번째구\n", frame);
				System.out.printf("쓰러트린 핀의 갯수를 입력하세요 (가능 - 0 ~ %s) : ", lmScore);
				strScore = scan.nextLine();

				try {
					intScore = Integer.valueOf(strScore);

					if (intScore > lmScore || intScore < 0) {
						System.out.printf("점수는 0~%s 까지 숫자만 입력가능합니다.\n", lmScore);
						continue;
					}
				} catch (NumberFormatException e) {
					System.out.println("점수입력이 잘못되었습니다. 다시 입력해주세요 :(");
					continue;
				}
				scoreList.add(intScore);
				break;
			}
			

			while (true) {
				if (frame == 10 && (lmScore - intScore) == 0) {
					System.out.printf("%s 프레임 세번째구\n", frame);
					System.out.print("쓰러트린 핀의 갯수를 입력하세요 (가능 - 0 ~ 10) : ");

					strScore = scan.nextLine();

					try {
						intScore = Integer.valueOf(strScore);

						if (intScore > 10 || intScore < 0) {
							System.out.println("점수는 0~10 까지 숫자만 입력가능합니다.");
							continue;
						}
					} catch (NumberFormatException e) {
						System.out.println("점수입력이 잘못되었습니다. 다시 입력해주세요 :(");
						continue;
					}
					scoreList.add(intScore);
				}
				break;
			}
		}
	}

	@Override
	public void calcScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

}

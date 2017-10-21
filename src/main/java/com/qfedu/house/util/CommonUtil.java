package com.qfedu.house.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public final class CommonUtil {

	private static final String CHARS="1234567890abcdefghijklmnopqrstuvwxyzQWERTYUIOPASDFGHJKLZXCVBNM";
	private static final int LEN=CHARS.length();
	
	private CommonUtil() {
		throw new AssertionError();
	}
	/**
	 * ����ָ����Χ���������
	 * @param min
	 * @param max
	 * @return�������
	 */
	public static int randomInt(int min,int max) {
		return (int)(Math.random()*(max-min)+min);
	}
	
    /**
     * ������ĸ���������ϵ�ָ�����ȵ���֤��
     * @param len ����
     * @return ��֤��
     */
	public static String generateCode(int len) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;++i) {
        	int index=randomInt(0,LEN);
        	sb.append(CHARS.charAt(index));
        }
        return sb.toString();
		}
		
	/**
	 * ����ָ������֤�����ɶ�Ӧ��ͼƬ
	 * @param code ��֤��
	 * @param width ͼƬ�Ŀ��
	 * @param length ͼƬ�ĸ߶�
	 * @return ��֤��ͼƬ
	 */
	public static BufferedImage generateCodeImage(String code,int width,int height){
		BufferedImage codeImage=new BufferedImage(width, height, 1);
		Graphics2D g=(Graphics2D)codeImage.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.BLACK);
		int size=(width-10)/code.length();
		g.setFont(new Font("Arial", Font.BOLD,size));
		for(int i=0;i<code.length();++i) {
			String currentChar=code.substring(i, i+1);
			g.drawString(currentChar,5+size*i,height/2);
		}
		g.setColor(Color.gray);
		for(int i=1;i<=5;++i) {
			int x1=randomInt(0, width);
			int y1=randomInt(0, height);
			int x2=randomInt(0, width);
			int y2=randomInt(0, height);
			g.drawLine(x1, y1, x2, y2);
		}
		return codeImage;
	}
}


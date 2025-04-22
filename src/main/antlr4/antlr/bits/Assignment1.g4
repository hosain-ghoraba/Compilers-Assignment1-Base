// Below is an example of writing ANTLR with embedded Java code

grammar Assignment1;

test: seg+ EOF;

seg:
	s = bit {
        String text = $s.text;
        if (text.equals("0") || text.equals("00")) {
            System.out.print("zeros,");
        } else {
            System.out.print("hello,");
        }
    };

bit: zeroes | ones;
zeroes: '0' | '00';
ones: '1' | '11';

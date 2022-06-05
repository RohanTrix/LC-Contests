class TextEditor {

    static class ListNode
    {
        char ch;
        ListNode next, prev;
        public ListNode(char ch)
        {
            this.ch = ch;
            next = null; prev = null;
        }
    }
    ListNode gen, cursor;
    public TextEditor() {
        gen = new ListNode('\0');
        cursor = gen;
    }
    
    public void addText(String text) {
        ListNode end = cursor.next;
        for(char ch : text.toCharArray())
        {
            ListNode curr = new ListNode(ch);
            cursor.next = curr;
            curr.prev = cursor;
            cursor = curr;
            curr = curr.next;
        }
        cursor.next = end;
        if(end!=null)
            end.prev = cursor;
        // print();
    }
    
    public int deleteText(int k) {
        int cnt = 0;
        ListNode end = cursor.next;
        for(int i = 0; i<k; i++)
        {
            if(cursor.prev == null) break;
            cnt++;
            cursor = cursor.prev;
        }
        cursor.next = end;
        if(end!=null)
            end.prev = cursor;
        // print();
        return cnt;
    }
    public void print()
    {
        ListNode tmp = gen.next;
        while(tmp!=null)
        {
            System.out.print(tmp.next);
            tmp = tmp.next;
        }
    }
    public String cursorLeft(int k) {
        for(int i = 0; i<k; i++)
        {
            if(cursor.prev == null) continue;
            cursor = cursor.prev;
        }
        return getLastChars();
    }
    public String getLastChars()
    {
        StringBuilder str = new StringBuilder();
        ListNode tmp = cursor;
        for(int i = 0; i<10; i++)
        {
            if(tmp.prev == null) continue;
            str.append(tmp.ch);
            tmp = tmp.prev;
        }
        str.reverse();
        // print();
        return str.toString();
    }
    
    public String cursorRight(int k) {
        
        for(int i = 0; i<k; i++)
        {
            if(cursor.next == null) continue;
            cursor = cursor.next;
        }
        return getLastChars();
    }
}

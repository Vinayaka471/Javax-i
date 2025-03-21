package com.xworkz.demo1;

public class ViratRunner {
    public static void main(String[] args) {
        // Creating Clips
        Clip[] clips = {
                new Clip(Clip.ClipColor.RED),
                new Clip(Clip.ClipColor.BLUE),
                new Clip(Clip.ClipColor.GREEN),
                new Clip(Clip.ClipColor.YELLOW),
                new Clip(Clip.ClipColor.BLACK)
        };

        // Creating Objects
        Pushpa pushpa = new Pushpa();
        Ticket ticket = new Ticket(Ticket.TicketType.VIP, 100.0);
        Cricket cricket = new Cricket(ticket);
        Brush brush = new Brush(Brush.BrushColor.BLACK);

        // Creating Virat Object
        Virat virat = new Virat(brush, clips, ticket, cricket);

        // Using the methods
        pushpa.useClip(clips);
        virat.play();
        virat.clean();
        virat.relax();
    }
}

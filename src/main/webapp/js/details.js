(function($) {

  $('.yr-episodes').after('<div class="yr-episode--details"></div>');

  var $details = $('.yr-episode--details');

  var $last = $();

  $('.yr-episode').click(function(ev) {

    ev.preventDefault();

    $last.removeClass('is-selected');
    $last = $(this).addClass('is-selected');

    var link = $(this).find('a').attr('href');
    $details.load(link + ' .yr-episode > *');
  });

})(jQuery);

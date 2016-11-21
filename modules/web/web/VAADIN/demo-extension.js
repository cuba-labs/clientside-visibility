// register extension
window.com_company_demo_web_DemoExtension = function() {
    var self = this;
    var element = self.getElement(self.getParentId());

    window.alert('Element ' + element + 'is shown!');
};